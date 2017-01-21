function p = predict(theta, X) 

m = size(X, 1);
num_labels = size(heta, 1);
p = zeros(size(X, 1), 1);
X = [ones(m, 1) X];
y = sigmoid(all_theta*X');
[max_values indices] = max(y);
p =indices';
end
