user1 = input("Please enter Player 1 name")
user2 = input("Please enter Player 2 name")

user1_choice = input(user1+" Please enter your choice of rock , paper, scissors? ").lower()
user2_choice = input(user2+" Please enter your choice of rock , paper, scissors?" ).lower()

if user1_choice==user2_choice :
    print("It is a tie")
elif user1_choice == "rock" :
    if user2_choice == "scissors" :
        print ("Rock wins !!")
    else:
        print ("Paper wins!!")
elif user1_choice =="scissors":
    if  user2_choice =="Paper":
        print("Scissors wins!!")       
    else :
        print("Rock wins!!") 

elif user1_choice == 'paper':
    if user2_choice == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")