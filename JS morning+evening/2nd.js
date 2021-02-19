var anime=["AOT", "DeathNote", "Naruto", "DBZ", "MHA"];
var character=["Goku", "Naruto", "Deku", "Kira", "Levi"];
var prime=[2, 3, 5, 7, 11, 13, 17, 19];


console.log(anime.concat(character));

function check(nm) {
    return nm >= 10;
  }

function square(nm){
    console.log(nm*nm)
}
  
console.log(prime.every(check));
console.log(prime.filter(check));
prime.forEach(square);
final=anime.join();
console.log(final);
var ind = final.lastIndexOf("DBZ");
console.log(ind);

function incre(nm){
    return nm+1;
}
var x = prime.map(incre);
console.log(x);

x.pop();
console.log(x);
x.push(20);
console.log(x);

console.log(x.reduce(incre));
console.log(x.reduceRight(incre));

x.reverse();
console.log(x);

console.log(x.shift());
console.log(x);

console.log(x.slice(2,6));

console.log(prime.some(check));

console.log(character.sort());

anime.splice(2, 0, "DemonSlayer", "Haikyuu");
console.log(anime);

x=x.toString();
console.log(x);


console.log(prime.unshift(0, 1));
console.log(prime);