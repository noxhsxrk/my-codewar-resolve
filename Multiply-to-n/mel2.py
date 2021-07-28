cache = {}
divocache = {}


def multiply(n, k):
    if k < 2: return k
    if (n, k) not in cache:
        if n not in divocache:
            divocache[n] = divv(n)
        cache[(n, k)] = sum(multiply(x, k - 1) for x in divocache[n])
        print(divocache)
    return cache[(n, k)]


def divv(n):
    result = []
    for i in range(1, (n // 2) + 1):
        if n // i == n / i:
            result.append(i)
    return result + [n]


print(multiply(24, 3))
