%Train Phase

num_labels = 5;
data = load('dummydata.mat');
X = data(:,1);
y = data(:,2);
lambda = 0.1;
[theta] = multivariate(X, y, num_labels, lambda);

%Prediction
p = predict(theta, X);
