function palabrasLargas(string, arreglo) {
    return arreglo.filter(palabra => palabra.length > string.length);
}

function imprimirArreglo(arreglo) {
    const ul = document.createElement('ul');
    arreglo.forEach(palabra => {
        const li = document.createElement('li');
        li.textContent = palabra;
        ul.appendChild(li);
    });
    document.body.appendChild(ul);
}

const arregloEjemplo = ['Sonora', 'Chihuahua', 'Morelos', 'Hidalgo', 'Tabasco', 'Yucatan'];
const arregloFiltrado = palabrasLargas('Jalisco', arregloEjemplo);
imprimirArreglo(arregloFiltrado);