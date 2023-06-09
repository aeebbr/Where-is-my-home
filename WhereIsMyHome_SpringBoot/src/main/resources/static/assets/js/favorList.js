const titles = document.querySelectorAll(".favor-list-region");

titles.forEach((title) => {
  title.addEventListener("click", () => {
    const t = title.childNodes;
    console.log(t);

    location.href = `/apt/aptlist?sido=${t[1].innerText}&gugun=${t[3].innerText}&dong=${t[5].innerText}`;
  });
});

const delBtns = document.querySelectorAll(".favor-list-btn-del");

delBtns.forEach((delBtn) => {
  delBtn.addEventListener("click", () => {
    fetch(`/favor/delete?id=${delBtn.id}`).then((res) => {
      if (res.status === 202) {
        location.href = `/favor/list`;
      }
    });
  });
});
