const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

const webpack = require('webpack');

module.exports = {
  configureWebpack: {
    plugins: [
      new webpack.EnvironmentPlugin({
        VUE_APP_API_URL: 'http://localhost:8081/leilao',
        VUE_APP_SECRET_KEY: 'my-secret-key',
        NODE_ENV: process.env.NODE_ENV
      })
    ]
  }
}
