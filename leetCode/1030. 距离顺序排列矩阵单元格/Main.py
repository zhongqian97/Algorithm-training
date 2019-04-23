class Solution:
    def allCellsDistOrder(self, R: int, C: int, r0: int, c0: int) -> List[List[int]]:
        mat = []
        for i in range(R):
            for j in range(C):
                mat += [[i,j]]
        mat = sorted(mat, key = lambda l: abs(l[0]-r0)+abs(l[1]-c0))
        return mat
