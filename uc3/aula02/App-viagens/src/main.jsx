import './index.css'
import React from 'react'
import App from './App.jsx'
import ReactDOM from 'react-dom/client'

// 1- Configurando o Router
import { createBrowserRouter, RouterProvider } from 'react-router-dom'

// Importar os componentes
import Home from './routes/Home.jsx'
import Aruba from './routes/Aruba.jsx'
import China from './routes/China.jsx'
import Escocia from './routes/Escocia.jsx'
import ErrorPage from './routes/ErrorPage.jsx'
import GrandCanyon from './routes/GrandCanyon.jsx'

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    errorElement: <ErrorPage />,
    children: [
      {
        path: "/",
      element: <Home />
      },
      {
        path: "/Aruba",
        element: <Aruba />
      },
      {
        path: "/China",
        element: <China />
      },
      {
        path: "/Escocia",
        element: <Escocia />
      },
      {
        path: "/GrandCanyon",
        element: <GrandCanyon />
      },
    ],
  },
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>,
)
