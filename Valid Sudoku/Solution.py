class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        #rows valid
        for i in range(9):
            s = set()
            for j in range(9):
                if board[i][j] in s:
                    return False
                elif board[i][j] != '.':
                    s.add(board[i][j])

        #cols valid
        for i in range(9):
            s = set()
            for j in range(9):
                item = board[j][i]
                if item in s:
                    return False
                elif item != '.':
                    s.add(item)

        #table
        starts = [(0,0), (0,3), (0,6),
                    (3,0), (3,3),(3,6),
                    (6,0), (6,3),(6,6)
                ]
        for i, j in starts:
            s = set()
            for row in range(i, i+3):
                for col in range(j, j+3):
                    items = board[row][col]
                    if items in s:
                        return False
                    elif items !='.':
                        s.add(items)
        
        return True
                
