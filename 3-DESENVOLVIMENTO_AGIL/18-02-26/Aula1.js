function p(a, b){
    let r =[];
    if (a != null && a.length > 0){
        for (let i = 0; i <a.length; i++){
            let x = false;
            if (a[i].V > b){
                if (a[i].s == true){
                    x = true;
                }
            }
            if(x){
                r.push(a[i].n.toUpperCase());
            }
        }
    }
    return r;
}

const dados = [{n:"Notebook", V:2500, s:true}, {n:"Mouse", V:50, s:true}];
console.log(p(dados,500));