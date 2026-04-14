function solution(topping) {
    let answer = 0;
    const person1 = new Map();
    for (let i = 0; i < topping.length; i++) {
        person1.set(topping[i], (person1.get(topping[i]) ?? 0) + 1);
    }
    const person2 = new Map();
    for (let top of topping) {
        person2.set(top, (person2.get(top) ?? 0) + 1);
        if (person1.get(top) == person2.get(top)) {
            person1.delete(top);
        }
        if (person1.size === person2.size) answer++;
    }
    return answer;
}