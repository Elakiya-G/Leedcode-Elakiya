// Last updated: 8/11/2026, 3:59:19 PM
/**
 * @return {Generator<number>}
 */
var fibGenerator = function* () {
    let a = 0;
    let b = 1;

    while (true) {
        yield a;
        let temp = a + b;
        a = b;
        b = temp;
    }
};