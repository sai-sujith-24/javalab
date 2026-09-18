import random
def play():
    lucky=random.randint(1,100)
    while True:
        user=int(input("enter the lucky num:"))
        if user==lucky:
            print("you win")
            break
        elif user<lucky:
            print("too low")
        else:
            print("too high")
play()