const recommendedContainer = document.getElementById("recommended");

function showRecommendation(products) {
  const randomProduct = products[Math.floor(Math.random() * products.length)];

  const div = document.createElement("div");
  div.className = "product";
  div.innerHTML = `
    <h3>${randomProduct.name}</h3>
    <p>£${randomProduct.price}</p>
    <small>Recommended based on popular items</small>
  `;

  recommendedContainer.appendChild(div);
}

showRecommendation(products);
