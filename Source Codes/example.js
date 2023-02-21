//import * as tf from '@tensorflow/tfjs-node';
// Define a model for linear regression.
const tf = require('@tensorflow/tfjs-node');
const model = sequential();
model.add(layers.dense({units: 1, inputShape: [1]}));

model.compile({loss: 'meanSquaredError', optimizer: 'sgd'});

// Generate some synthetic data for training.
const xs = tensor2d([1, 2, 3, 4, 5, 6, 7], [7, 1]);
const ys = tensor2d([1, 3, 5, 7, 9, 11, 13], [7, 1]);

// Train the model using the data.
model.fit(xs, ys, {epochs: 1000}).then(() => {
  // Use the model to do inference on a data point the model hasn't seen before:
  model.predict(tensor2d([0,15], [2, 1])).print();
  // Open the browser devtools to see the output
});
