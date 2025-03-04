import numpy as np
import time

stime = time.time()
infile = open('testdata.txt', 'r')
outfile = open('result_Python_dot.txt', 'w')

while True:
    s = infile.readline()
    if not s:
        break
    if s[0].isdigit():
        time1 = time.time()
        q = int(s)
        leftMatrix = np.zeros((q, q), int)
        rightMatrix = np.zeros((q, q), int)
        # resultVector = np.zeros((q,), int)
        for i in range(q):
            s = infile.readline()
            ss = s.split()
            for j in range(q):
                leftMatrix[i][j] = ss[j]
        infile.readline()
        for i in range(q):
            s = infile.readline()
            ss = s.split()
            for j in range(q):
                rightMatrix[i][j] = ss[j]
        resultMatrix = np.dot(leftMatrix, rightMatrix)
        print(q)
        outfile.write(str(q) + "\n")
        # for i in range(q):
        #     resultVector[:] = 0
        #     r = []
        #     for k in range(q):
        #         x = leftMatrix[i][k]
        #         for j in range(q):
        #             resultVector[j] += x * rightMatrix[k][j]
        #     for j in range(q):
        #         r.append("\t\t" + str(resultVector[j]))
        #     temp = ''.join(r)
        #     print(temp)
        #     outfile.write(temp + "\n")
        for i in range(q):
            r = []
            for j in range(q):
                r.append("\t\t" + str(resultMatrix[i][j]))
            temp = ''.join(r)
            print(temp)
            outfile.write(temp + "\n")
        print(str(q) + ": success!")
        time2 = time.time()
        temp = "TIME: " + '{:.6f}'.format(time2 - time1) + "s.\n"
        print(temp)
        outfile.write(temp + "\n")
        outfile.flush()
        r.clear()

etime = time.time()
temp = "TOTAL TIME: " + '{:.6f}'.format(etime - stime) + "s."
print(temp)
outfile.write(temp + "\n")
outfile.flush()
infile.close()
outfile.close()
