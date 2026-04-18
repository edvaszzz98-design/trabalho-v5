function Projetos() {
  const projetos = [
    {
      titulo: "Portfólio Pessoal",
      descricao: "Meu site feito com HTML, CSS e JavaScript",
      link: "https://github.com/edvaszzz98-design"
    },
    {
      titulo: "Projeto de Estudos",
      descricao: "Sistema simples feito durante o curso",
      link: "https://github.com/edvaszzz98-design/trabalhoi"
    }
  ];

  return (
    <section>
      <h2>Meus Projetos</h2>

      <div style={{ display: "flex", gap: "20px", flexWrap: "wrap" }}>
        {projetos.map((projeto, index) => (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              padding: "15px",
              borderRadius: "10px",
              width: "250px"
            }}
          >
            <h3>{projeto.titulo}</h3>
            <p>{projeto.descricao}</p>
            <a href={projeto.link} target="_blank" rel="noopener noreferrer">
              Ver no GitHub
            </a>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Projetos;
