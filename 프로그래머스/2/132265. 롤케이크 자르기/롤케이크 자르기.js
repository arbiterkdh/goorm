function solution(topping) {
    let answer = 0;
    const totalToppings = new Map();
    for (let i = 0; i < topping.length; i++) {
        totalToppings.set(topping[i], (totalToppings.get(topping[i]) ?? 0) + 1);
    }
    const toppings = new Set();
    for (let top of topping) {
        toppings.add(top);
        if (totalToppings.has(top)) {
            totalToppings.set(top, totalToppings.get(top) - 1);
            if (totalToppings.get(top) == 0) {
                totalToppings.delete(top);
            }
        }
        if (totalToppings.size === toppings.size) answer++;
    }
    return answer;
}