//Tabs
////////////////////////////////////////////////////////////////////////////////////
const liBarraNav = document.querySelectorAll('.item--barraNavegacion')
const bloquesNav = document.querySelectorAll('.item__bloque')

liBarraNav.forEach( (cadaLi, i) => {
    liBarraNav[i].addEventListener('click', ()=> {
        
        liBarraNav.forEach((cadaLi, i) => {
            liBarraNav[i].classList.remove('active')
            bloquesNav[i].classList.remove('active')
        })//forEach 1

        liBarraNav[i].classList.add('active')
        bloquesNav[i].classList.add('active')
    }) //event onClick

})//forEach 0


//Carrousel
//////////////////////////////////////////////////////////////////////////////////// 

const imagenes = document.querySelector('.juego')
const puntos = document.querySelectorAll('.punto')

puntos.forEach( (cadaPunto, i)=> {
    puntos[i].addEventListener('click', ()=>{
        let operacion = i * -30
        imagenes.style.transform = `translateX(${operacion}%)`

        puntos.forEach((cadaPunto, i) =>{
            puntos[i].classList.remove('activo')
        })//forEach 1

        puntos[i].classList.add('activo')
    })//event onClick
}) //forEach 0