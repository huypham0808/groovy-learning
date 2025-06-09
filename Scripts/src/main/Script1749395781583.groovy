//def numbers = [1, 2, 3, 4, 5]
//def evenNumbers = numbers.findAll { it % 2 == 0}
//println "Danh sach: ${evenNumbers}"


def numbers = [1, 2, 3, 4, 5]

def firstNumber = numbers[0]
//println "First number: $firstNumber"
//numbers.each { println it }
def squared = numbers.collect { it * it }
def sum = numbers.sum()
println "\u001B[33m Sum all item in array: $sum \u001B[0m"

//Sort a array list
//In text to console with yellow color \u001B[33m...\u001B[0m
def listNumber = [3, 4, 1, 2, 0]
println "\u001B[33m List before sort $listNumber \u001B[0m"
def listAfterSort = listNumber.sort()
println "\u001B[33m List after sort $listAfterSort \u001B[0m"
//Map data type in Groovy
def scores = ["Alice": 90, "Bob": 85, "Charlie": 95]
println "\u001B[33m Print scores $scores \u001B[0m"
def aliceScore = scores["Alice"]
println "\u001B[33m Print Alice scores $aliceScore \u001B[0m"
scores.each { key, value -> println "$key: $value" }

