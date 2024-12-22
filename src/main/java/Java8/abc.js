function abc(){
    for(var i=1;i<=5;i++){
        print("HELLO EVERYBODY : "+i)
    }
    print("---------------")
}
function add(a,b){
    print("The sum of "+a+" and "+b+"is "+(a+b))
}
function greet(fname , lname){
    return "Welcome ! "+fname+" "+lname;
}
abc();
add(12,23);
print(greet("Anand","Kumar"))

