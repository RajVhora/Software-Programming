import numpy as np
sigma = np.array([[7,1,40],[1,30,11],[40,11,27]])
print(sigma)
eig_val, eig_vec = np.linalg.eig(sigma)
print(eig_val)
print(eig_vec)

q = eig_vec.T
#print(sci.inv(eig_vec))
#print(eig_vec.T)

#Diagonal Matrix
temp = np.matmul(sigma,q.T)
sigma_prime = np.matmul(q,temp)
print(sigma_prime)

#print(eig_vec.T*sigma*eig_vec)

