import { useState } from 'react'
import './App.css'
import './assets/coin-icon.png'

function App() {

  return (
    <div className="flex flex-col items-center justify-center min-h-screen bg-gradient-to-tr from-purple-600 to-green-600">
      <div className="flex items-center gap-1">
        <img src="./src/assets/coin-icon.png" alt="Coin Icon" className="w-25 h-25" />
        <h1 className="text-6xl font-bold text-white">BrainCoins</h1>
      </div>
      <p className="text-lg text-white font-light">Sistema de Moeda Estudantil</p>
    </div>  
  )
}

export default App
