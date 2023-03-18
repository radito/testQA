const chai = require('chai');
const expect = require('chai').expect;
const chaiHttp = require('chai-http');

chai.use(chaiHttp);

const firstEndpoint = "https://reqres.in/api/users?page=2";
const secondEndpoint = "https://reqres.in/api/users/2";

let firstJson, secondJson;

describe(`First Endpoint ${firstEndpoint}`, function () {
    it('Have 200 Response Code', async () => {
        const res = firstJson = await chai.request(firstEndpoint).get('/');
        const errorMessage = `Invalid Http Status (${res.status})`;

        expect(res.status, errorMessage).to.eq(200);
    });

    it('Response Body Must Be JSON', () => {
        const errorMessage = `Invalid Content Type (${firstJson.type})`;

        expect(firstJson, errorMessage).to.be.json;
    });

    it('Page Should equal to Two', () => {
        const errorMessage = `Invalid Page Number`;
        expect(firstJson.body.page, errorMessage).to.eq(2);
    });

    it('Should Have `support` object', () => {
        expect(firstJson.body).to.haveOwnProperty('support');
        expect(firstJson.body.support).to.haveOwnProperty('url');
        expect(firstJson.body.support).to.haveOwnProperty('text');

        expect(firstJson.body.support.url).to.be.a('string');
        expect(firstJson.body.support.text).to.be.a('string');
    });

    it('Should Have `data` object', () => {
        expect(firstJson.body).to.haveOwnProperty('data');
    });

    it('`data` object should contain an array', async () => {
        expect(firstJson.body.data).to.be.an('array');
    });

    it('`data` array should have property', async () => {
        firstJson.body.data.forEach((v,i) => {
            expect(v).to.haveOwnProperty('id');
            expect(v).to.haveOwnProperty('email');
            expect(v).to.haveOwnProperty('first_name');
            expect(v).to.haveOwnProperty('last_name');
            expect(v).to.haveOwnProperty('avatar');
        });
    });

    it('`data` array should have correct type', async () => {
        firstJson.body.data.forEach((v,i) => {
            expect(v.id).to.be.a('number');
            expect(v.email).to.be.a('string');
            expect(v.first_name).to.be.a('string');
            expect(v.last_name).to.be.a('string');
            expect(v.avatar).to.be.a('string');
        });
    });

});

describe(`Second Endpoint ${secondEndpoint}`, function () {
    it('Have 200 Response Code', async () => {
        const res = secondJson = await chai.request(secondEndpoint).get('');
        const errorMessage = `Invalid Http Status (${res.status})`;

        expect(res.status, errorMessage).to.eq(200);
    });

    it('Response Body Must Be JSON', () => {
        const errorMessage = `Invalid Content Type (${firstJson.type})`;

        expect(secondJson, errorMessage).to.be.json;
    });

    it('Should Have `support` object', () => {
        expect(secondJson.body).to.haveOwnProperty('support');
        expect(secondJson.body.support).to.haveOwnProperty('url');
        expect(secondJson.body.support).to.haveOwnProperty('text');

        expect(secondJson.body.support.url).to.be.a('string');
        expect(secondJson.body.support.text).to.be.a('string');
    });

    it('Should Have `data` object', () => {
        expect(secondJson.body).to.haveOwnProperty('data');
    });

    it('`data` object should have property', () => {
        expect(secondJson.body.data).to.haveOwnProperty('id');
        expect(secondJson.body.data).to.haveOwnProperty('email');
        expect(secondJson.body.data).to.haveOwnProperty('first_name');
        expect(secondJson.body.data).to.haveOwnProperty('last_name');
        expect(secondJson.body.data).to.haveOwnProperty('avatar');
    });

    it('`data` object should have correct type', () => {
        expect(secondJson.body.data.id).to.be.a('number');
        expect(secondJson.body.data.email).to.be.a('string');
        expect(secondJson.body.data.first_name).to.be.a('string');
        expect(secondJson.body.data.last_name).to.be.a('string');
        expect(secondJson.body.data.avatar).to.be.a('string');
    });

});