import './App.css'
import paisagem from './assets/paisagem.jpg'

function App() {
  const nome = "Matheus"

  return (
    <>
      <h2> Olá, meu nome é: {nome}! </h2>
      <img src={paisagem} alt="Uma foto de uma paisagem" />
    </>
  )
}

export default App
