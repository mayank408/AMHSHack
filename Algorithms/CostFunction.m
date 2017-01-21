function [J, grad] = CostFunction(theta, X, y, lambda)

m = length(y);
J = 0;
grad = zeros(size(theta));
h = sigmoid(X*theta);
H1 = log(h);
H2 = log(1-h);
S = sum(-(y.*H1 + (1-y).*H2));
T = sum(theta(2:length(theta), 1).*theta(2:length(theta), 1));
J = S./m + T.*(lambda/(2*m));
sumvar = sum(((h-y).*X)' , 2);
temp = (1/m)*sumvar(1,1);
sumvar = sumvar.*(1/m) + theta.*(lambda/m);
sumvar(1,1) = temp;
grad = sumvar;     
grad = grad(:);
end
