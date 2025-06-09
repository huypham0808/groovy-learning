def numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
def newList = numbers.findAll{it % 2 == 0}
println "\u001B[33m ${newList} \u001B[0m"