import { createRouter, createWebHistory } from 'vue-router'
import MainMenu from '../components/MainMenu.vue'
import EmpresaDetalhes from '../components/EmpresaDetalhes.vue'

const routes = [
    { path: '/', component: MainMenu },
    { path: '/empresa', component: EmpresaDetalhes },
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router