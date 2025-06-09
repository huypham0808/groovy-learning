
def listNum = [1, 2, 3, 4, 5]

listNum.each { taskNum ->
	Thread.start {
		println "Processing task ${taskNum}"
	}
}
