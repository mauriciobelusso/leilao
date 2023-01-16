import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import VeeValidate from 'vee-validate';

const app = createApp(App)

app.use(router)
app.use(VeeValidate)

app.mount('#app')
