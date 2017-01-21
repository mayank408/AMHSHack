import numpy as np


class LinearRegression(object):
    """
    Parameters
    ----------
    eta: float
        learning rate between 0.0 and 0.1
    n_iter: int
        passes over the training dataset

    Attributes
    ----------
    w_ = 1D array
        Weights after fitting
    errors_ : list
        Number of misclassifications in every Epoch
    """

    def __init__(self, eta = 0.01, n_iter = 50):
        self.eta = eta
        self.n_iter = n_iter

    def fit (self, X, y):
        """Fit training data.
        Parameters
        ----------
        X: array-like, shape [n_samples, n_features] n x m
            ^Training Vectors
        y: array-like, shape = [n_samples]
            ^Target values

        Returns
        -------
        self: object
        """
        #Adding an extra weight w0 to the weights vector
        self.w_ = np.random.random(X.shape[1])
        self.cost_ = []
        #print ('Initial weights are: %r' %self.w_)
        for i in range(self.n_iter):
            output = self.net_input(X)
            #print ("On iteration %d, output is: %r" %(i, output))
            errors = y - output
            #print("On iteration %d, Error is: %r" %(i, errors))
            self.w_ += self.eta * X.T.dot(errors)
            #print ('Weights on iteration %d: %r' %(i, self.w_))
            cost = (errors**2).sum() / 2.0
            self.cost_.append(cost)
            #print ("On iteration %d, Cost is: %r" %(i, cost))
            #prediction = self.predict(X)
            #print ("Prediction after iteration %d is: %r" %(i, prediction))
        return self

    def net_input(self, X):
        #returns the value on a specific hour of the day
        """Calculate net input"""
        return X.dot(self.w_)

    def activation(self, X):
        """Computer Linear Activation"""
        return self.net_input(X)

    def prediction(self, X):
        #prediction
        self.sumall = 0
        for idx, elem in enumeration(X):
            self.sumall = predict(elem)
        self.sumall = self.sumall/size(self.sumall);
        return self.sumall

####### END OF THE CLASS ########
import pandas as pd
df = pd.read_csv("ebcsv.csv", header = None)
y = df.iloc[0:100, 4].values
y = np.where(y == 'Iris-setosa', -1, 1)
print(y)
X = df.iloc[0:100, [0, 2]].values
#Adding the ones column to the X matrix
X = np.insert(X, 0,  np.ones(X.shape[0]), axis = 1)

#Feature scaling the two attributes individually
X_std = np.copy(X)
X_std[:, 1] = (X[:, 1] - X[:, 1].mean()) / X[:, 1].std()
X_std[:, 2] = (X[:, 2] - X[:, 1].mean()) / X[:, 2].std()
#Now both the arguments are feature scaled via normal distribution
#fig, ax = plt.subplots(nrows = 1, ncols = 2, figsize = (8, 4))

ada = AdalineGD(n_iter = 20, eta = 0.0001).fit(X, y)
#dailyValues is a vector 24 x 2 which averages the daily electricity consumption
ada.prediction(dailyValues)
