function edit(x){
a=x.sort();
console.log(a);
b=x.map(t => t*10);
console.log(b);
c=x.filter(t => t%3===0);
console.log(c);
}

test=[3,6,1,8,0,3,5,7];
edit(test);


