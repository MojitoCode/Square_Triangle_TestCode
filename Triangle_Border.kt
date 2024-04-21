fun main() {
  // Triangle Variables
  val triRows = 10
  var triCount = 0
  var triRowLen = triRows
  //character used to create the border shape
  val triChar1 = "0  "
  //set variable with 3 whitespace characters - when called later, it will give the effect of an empty triangle
  val triChar2 = "   "
  // Write your code below
  for(x in triRows downTo 1){
    while(triCount < triRowLen){
      triCount++
      if(triCount != 1 && triCount != triRowLen && x != triRows){
        print(triChar2)
      }
      else{
        print(triChar1)
      }
    }
    triCount=0
    println()
    triRowLen--
  }
}
