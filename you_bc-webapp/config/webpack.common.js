const path = require('path');
const helpers = require('./helpers');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const CleanWebpackPlugin = require('clean-webpack-plugin');
const webpack = require('webpack');

const dist = './build';

module.exports = {
    entry: [
        './src/index.js'
    ],
    output: {
        path: helpers.root('.', 'build'),
        filename: 'bundle.js'
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: /node_modules/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['env', 'react'],
                        plugins: ['transform-object-rest-spread']
                    }
                }
            },
            {
                test: /\.(css|less)$/,
                use: [{
                    loader: 'style-loader'
                },{
                    loader: 'css-loader'
                },{
                    loader: 'less-loader'
                }]
            },
            {
                test: /\.(png|jpe?g|gif|svg|woff|woff2|ttf|eot|ico)$/,
                use: {
                    loader: 'file-loader?name=assets/[name].[hash].[ext]'
                }
            }
        ]
    },
    plugins: [
        new CleanWebpackPlugin([dist]),
        new HtmlWebpackPlugin({
            template: './public/index.html',
            filename: 'index.html',
            inject: 'body'
        })
    ],
    resolve: {
        extensions: ['.js', '.jsx'],
    }
};