<template>
    <div>
      <nav>
        <ul>
          <li><router-link to="/">Home</router-link></li>
          <li><router-link to="/empresa">Empresa</router-link></li>
        </ul>
      </nav>
      <router-view />
    </div>
  </template>
  
  <script>
  export default {
  
  }
  </script>
  