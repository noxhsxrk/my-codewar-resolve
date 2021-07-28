def bouncing(h, bounce, window):
    count = 1
    if h <= 0 or bounce <= 0 or bounce >= 1 or window >= h:
        return -1
    if h * bounce <= window:
        return 1

    while 1:
        if h >= window:
            count += 1
        else:
            break
        h = h * bounce
        if h >= window:
            count += 1
    return count - 1
