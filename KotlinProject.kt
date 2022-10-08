package study.e.androidcourse
//ToDo project
fun main() {

    val person1 = Task(1,"Aljawhara","Dinner with Nora")
    val person2 = Task(2,"Sara","Travel to LA")
    val person3 = Task(3,"Fahad","Email to Aljawhara")

    val toDo = ToDo()
     toDo.addTask(person1)
     toDo.addTask(person2)
     toDo.addTask(person3)
     toDo.specificTask(person2.ID)
     toDo.removeTask(person2)
     toDo.changeTask(person1)
     toDo.showAllTask()
}
data class Task(val ID :Int , val name:String, var note :String, var isCompleted:Boolean=false)

class ToDo {

    private val tasks = arrayListOf<Task>()

    fun showAllTask (){
        println("All Tasks:")
        for (task in tasks){
            println("Task: ${task.note}")
        }

    }
    fun specificTask (id:Int){
        var num = 0
        for (task in tasks){
            if(task.ID==id){
                println("Task Details: ID (${task.ID}), Name (${task.name}), Task (${task.note}), Completed (${task.isCompleted})")
                num++
            }
        }
        if (num==0) println("There is no person have an ID:$id")
    }
    fun addTask (task:Task){
        tasks.add(task)
        println("Add Task: ${task.note}")
    }
    fun removeTask (task :Task){
        for(inTask in tasks){
            if(inTask == task ){
                tasks.remove(inTask)
                println("Remove Task: ${inTask.note}")
            }
        }
    }
    fun changeTask(task:Task){
        for (inTask in tasks){
            if (inTask == task){
                inTask.isCompleted=!inTask.isCompleted
                println("Task: ${inTask.note}, complete: ${inTask.isCompleted} ")
            }
        }

    }

}