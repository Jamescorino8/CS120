#!/bin/zsh

cd ~/dev/temp
git clone git@github.com:Jamescorino8/CS120_Lab5.git
cd ~/dev/temp/CS120_Lab5
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Lab5 ~/dev/temp/CS120_Lab5
git merge CS120_Lab5/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
mkdir lab5
git mv Main.java lab5
git commit -m "merge lab5"
git remote rm CS120_lab5

cd ~/dev/temp
git clone git@github.com:Jamescorino8/CS120_Lab6.git
cd ~/dev/temp/CS120_Lab6
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Lab6 ~/dev/temp/CS120_Lab6
git merge CS120_Lab6/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
mkdir lab6
git mv Main.java lab6
git commit -m "merge lab6"
git remote rm CS120_lab6

cd ~/dev/temp
git clone git@github.com:Jamescorino8/CS120_Project3.git
cd ~/dev/temp/CS120_Project3
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Project3 ~/dev/temp/CS120_Project3
git merge CS120_Project3/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add ticketsA.txt
git add ticketsB.txt
mkdir project3
git mv Main.java project3
git mv ticketsA.txt project3
git mv ticketsB.txt project3
git commit -m "merge project3"
git remote rm CS120_project3

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Lab7.git
cd ~/dev/temp/CS120_Lab7
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Lab7 ~/dev/temp/CS120_Lab7
git merge CS120_Lab7/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add Card.java
git add CardDriver.java
git add Deck.java
git add DeckDriver.java
git add Pick6.java
git add ShoppingList.java
git add ShoppingListDriver.java
mkdir lab7
git mv Main.java
git mv Card.java lab7
git mv CardDriver.java lab7
git mv Deck.java lab7
git mv DeckDriver.java
git mv Pick6.java
git mv ShoppingList.java
git mv ShoppingListDriver.java
git commit -m "merge lab7"
git remote rm CS120_lab7

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Lab8.git
cd ~/dev/temp/CS120_Lab8
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Lab8 ~/dev/temp/CS120_Lab8
git merge CS120_Lab8/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add DebugMe.java
git add Section.java
git add Student.java
mkdir lab8
git mv Main.java lab8
git mv DebugMe.java lab8
git mv Section.java lab8
git mv Student.java lab8
git commit -m "merge lab8"
git remote rm CS120_lab8

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Lab9.git
cd ~/dev/temp/CS120_Lab9
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Lab9 ~/dev/temp/CS120_Lab9
git merge CS120_Lab9/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add ArrayUtilities.java
git add Property.java
mkdir lab9
git mv Main.java lab9
git commit -m "merge lab9"
git remote rm CS120_lab9

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Lab10.git
cd ~/dev/temp/CS120_Lab10
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Lab10 ~/dev/temp/CS120_Lab10
git merge CS120_Lab10/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add Bottle.java
git add Box.java
git add StackOfBoxes.java
mkdir lab10
git mv Main.java lab10
git mv Bottle.java lab10
git mv Box.java
git mv StackOfBoxes.java
git commit -m "merge lab10"
git remote rm CS120_Lab10

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Thermostat.git
cd ~/dev/temp/CS120_Thermostat
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Thermostat ~/dev/temp/CS120_Thermostat
git merge CS120_Thermostat/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add Thermostat.java
mkdir thermostat
git mv Main.java thermostat
git mv Thermostat.java thermostat
git commit -m "merge thermostat"
git remote rm CS120_thermostat

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_BankAccount.git
cd ~/dev/temp/CS120_BankAccount
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_BankAccount ~/dev/temp/CS120_BankAccount
git merge CS120_BankAccount/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add BankAccount.java
mkdir bankAccount
git mv Main.java bankAccount
git mv BankAccount.java bankAccount
git commit -m "merge bankAccount"
git remote rm CS120_BankAccount

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Arrays.git
cd ~/dev/temp/CS120_Arrays
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Arrays ~/dev/temp/CS120_Arrays
git merge CS120_Arrays/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
mkdir arrays
git mv Main.java arrays
git commit -m "merge arrays"
git remote rm CS120_Arrays

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_LabPractical.git
cd ~/dev/temp/CS120_LabPractical
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_LabPractical ~/dev/temp/CS120_LabPractical
git merge CS120_LabPractical/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add ArrayUtility.java
git add Car.java
git add WarmUp.java
mkdir labPractical
git mv Main.java labPractical
git mv ArrayUtility.java
git mv Car.java
git mv WarmUp.java
git commit -m "merge labPractical"
git remote rm CS120_labPractical

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Dictionary.git
cd ~/dev/temp/CS120_Dictionary
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Dictionary ~/dev/temp/CS120_Dictionary
git merge CS120_Dictionary/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add Dictionary.java
git add PartOfSpeech.java
git add Word.java
mkdir dictionary
git mv Main.java dictionary
git commit -m "merge dictionary"
git remote rm CS120_Dictionary

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_LabPracticalPractice.git
cd ~/dev/temp/CS120_LabPracticalPractice
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_LabPracticalPractice ~/dev/temp/CS120_LabPracticalPractice
git merge CS120_LabPracticalPractice/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
git add ArrayUtility.java
git add Contestant.java
git add WarmUp.java
mkdir labPracticalPractice
git mv Main.java labPracticalPractice
git mv ArrayUtility.java labPracticalPractice
git mv Contestant.java labPracticalPractice
git mv WarmUp.java labPracticalPractice
git commit -m "merge labPracticalPractice"
git remote rm CS120_labPracticalPractice

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_MinMaxAvg.git
cd ~/dev/temp/CS120_MinMaxAvg
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_MinMaxAvg ~/dev/temp/CS120_MinMaxAvg
git merge CS120_MinMaxAvg/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
mkdir minMaxAvg
git mv Main.java minMaxAvg
git commit -m "merge minMaxAvg"
git remote rm CS120_MinMaxAvg

cd ~/dev/temp
git@github.com:Jamescorino8/CS120_Random.git
cd ~/dev/temp/CS120_Random
git checkout -b merge-prep
cd ~/dev/CS120
git remote add -f CS120_Random ~/dev/temp/CS120_Random
git merge CS120_Random/merge-prep --no-commit --allow-unrelated-histories
git add Main.java
mkdir random
git mv Main.java random
git commit -m "merge random"
git remote rm CS120_Random
