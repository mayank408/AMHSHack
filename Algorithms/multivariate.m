function [theta] = multivariate(X, y, num_labels, lambda)
m = size(X, 1);
n = size(X, 2);
all_theta = zeros(num_labels, n + 1);
X = [ones(m, 1) X];
initial_theta = zeros(n + 1, 1);
for c = 1:num_labels
initial_theta = zeros(n + 1, 1);    
	options = optimset('GradObj', 'on', 'MaxIter', 50);
	[theta, cost] = fmincg (@(t)(CostFunction(t, X, (y == c), lambda)), initial_theta, options);
	theta(c,:) = theta' ;	
endfor
end
