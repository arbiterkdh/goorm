function solution(priorities, location) {
    let answer = 0;
    const priorityMap = new Map();
    for (let i = 0; i < priorities.length; i++) {
        priorityMap.set(priorities[i], (priorityMap.get(priorities[i]) ?? 0) + 1);
    }
    let p = 9;
    while (p > 0) {
        if (!priorityMap.has(p)) {
            p--;
            continue;
        }
        for (let i = 0; i < priorities.length; i++) {
            if (priorities[i] !== p) continue;
            priorityMap.set(p, priorityMap.get(p) - 1);
            answer++;
            if (i === location) return answer;
            if (priorityMap.get(p) === 0) {
                p--;
                while (p > 0 && !priorityMap.has(p)) p--;
            }
        }
    }
    return answer;
}