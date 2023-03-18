let caseNum = 1;

const describe = function (message, callback) {
    console.log('------------------------------------');
    console.log(`Case ${caseNum} - ${message}`);

    if (callback() == false) {
        console.log(`\nCase ${caseNum} - [Failed] ❌`);

        caseNum++;

        return;
    }

    console.log(`\nCase ${caseNum} - [Success] ✅`);
    caseNum++;
}

const json = {
    name: "sidik hadiwijaya",
    orderNumber: "76542019",
    courier: "JNE",
    product: [
        {
            item: "laptop asus",
            price: 12000000
        },
        {
            item: "laptop acer",
            price: 10000000
        },
        {
            item: "Macbook pro",
            price: 30000000
        }
    ],
    total: 20000000,
    code: 200,
    success: true
};

console.log("Starting Test ...\n");

describe('success should be true', () => {
    return json.success == true;
});

describe('Code should equal to 200', () => {
    return json.code == 200;
});

describe('orderNumber Should have Integer Type', () => {
    let type = typeof json.orderNumber == 'number';

    if (type) {
        console.log(`Test Passed, Data Type is (Integer)`);
    } else {
        console.log(`Test Failed, Data Type is (${typeof json.orderNumber})`);
    }

    return type;
});

describe('Total should match with product price', () => {
    let total = 0;

    json.product.forEach((v, i) => total += v.price);

    const isTotalEqual = total == json.total;

    const totalFormat = new Intl.NumberFormat("id-ID").format(total);
    const totalFormatJson = new Intl.NumberFormat("id-ID").format(json.total);

    if (isTotalEqual) {
        console.log(`Test Passed, Total is, Rp ${totalFormat}`)
    } else {
        console.log(`Test Failed, Total Rp ${totalFormatJson} is false, total is must be Rp ${totalFormat}`);
    }

    return isTotalEqual;
});

console.log('------------------------------------');
console.log("\nTest Stopped !");