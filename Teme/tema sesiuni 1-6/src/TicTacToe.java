import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static char currentPlayer;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean playAgain;
        do {
            initializeBoard();
            playGame();
            playAgain = askPlayAgain();
        } while (playAgain);
    }

    // Inițializarea tabelei de joc
    public static void initializeBoard() {
        System.out.println("Welcome to the X and 0 game");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '*';
            }
        }
        printBoard();
        choosePlayer();
    }

    // Afișarea tabelei
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Alegerea jucătorului
    public static void choosePlayer() {
        System.out.println("Choose X or 0:");
        char choice;
        while (true) {
            choice = scanner.next().charAt(0);
            if (choice == 'X' || choice == '0') {
                currentPlayer = choice;
                System.out.println("You chose: " + currentPlayer);
                break;
            } else {
                System.out.println("Invalid choice. Please choose X or 0.");
            }
        }
    }

    // Alternarea între jucători
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? '0' : 'X';
    }

    // Jocul propriu-zis
    public static void playGame() {
        boolean gameWon = false;
        int turns = 0;

        while (!gameWon && turns < 9) {
            printBoard();
            System.out.println("Current player: " + currentPlayer);
            playerMove();
            gameWon = checkWinner();
            if (!gameWon) {
                switchPlayer();
            }
            turns++;
        }

        printBoard();
        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    // Mutarea jucătorului
    public static void playerMove() {
        int row = -1, col = -1;
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Enter row and column (1-3 for each): ");
            try {
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;

                if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                    if (board[row][col] == '*') {
                        board[row][col] = currentPlayer;
                        validMove = true;
                    } else {
                        System.out.println("This position is already occupied. Try again.");
                    }
                } else {
                    System.out.println("Invalid position. Please enter row and column between 1 and 3.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.nextLine(); // Clear the buffer
            }
        }
    }

    // Verificarea câștigătorului
    public static boolean checkWinner() {
        // Verificăm rânduri, coloane și diagonale
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true; // Rânduri
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true; // Coloane
            }
        }
        // Verificăm diagonalele
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    // Întrebăm dacă se dorește rejucarea
    public static boolean askPlayAgain() {
        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.next().toLowerCase();
        return response.startsWith("y");
    }
}
