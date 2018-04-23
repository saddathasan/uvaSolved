/**
 * 
 */
package volume_001_Problem_100_to_199;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * @version
 *
 *
 *
 *The Block Problem
 */


class Block {
	
	public int id, contentOnStack;
	public static final int MaxNumber = 25;
	public int [] stacks;
	
	public Block() {
		id = contentOnStack = 0;
		stacks = new int[MaxNumber];
	}
	public Block (int id) {
		this.id = id;
		contentOnStack = 1;
		stacks = new int[MaxNumber];
		Arrays.fill(stacks, 0);
		stacks[0] = id;
	}
	public int getTop() {
		if (contentOnStack > 0) {
			return stacks[contentOnStack - 1];
		} else {
			return -1;
		}
	}
	public boolean contains (int id) {
		for (int i = 0; i < contentOnStack; ++i) {
			if (stacks[i] == id) {
				return true;
			}
		}
		return false;
	}
	public void print() {
		System.out.printf("%d:", id);
		if (contentOnStack > 0) {
			for (int i = 0; i < contentOnStack; ++i) {
				System.out.printf(" %d", stacks[i]);
			}
		}
		System.out.printf("\n");
	}
}

public class Problem_101 {
	
	public static Scanner cin = new Scanner (new BufferedInputStream(System.in));
	public static final int MAXN = 25;
	public static int [] position = new int[MAXN];
	public static Block [] blocks;
	
	public static int moveTop(Block from, Block to) {
		if (from.getTop() == -1) {
			return -1;
		}
		position[from.getTop()] = to.id;
		return to.stacks[to.contentOnStack++] = from.stacks[--from.contentOnStack];
	}
	
	public static void returnAll(Block block, int id) {
		if (!block.contains(id)) {
			return;
		}
		while(block.getTop() != id) {
			moveTop(block, blocks[block.getTop()]);
		}
	}
	
	public static void main(String[] args) {
		int n = cin.nextInt();
		blocks = new Block[n];
		for (int i = 0; i < n; ++i) {
			blocks[i] = new Block(i);
			position[i] = i;
		}
		Block tmpBlock = new Block();
		while (true) {
			String command = cin.next();
			if (command.equals("quit")) {
				break;
			}
			int from = cin.nextInt();
			String action = cin.next();
			int to = cin.nextInt();
			if (from == to || from < 0 || from >= n || to < 0 || to >= n || position[from] == position[to]) {
				continue;
			}
			if (command.equals("move")) {
				if (action.equals("onto")) {
					returnAll(blocks[position[to]], to);
				}
				returnAll(blocks[position[from]], from);
				moveTop(blocks[position[from]], blocks[position[to]]);
			} else if (command.equals("pile")) {
				if (action.equals("onto")) {
					returnAll(blocks[position[to]], to);
				}
				while(moveTop(blocks[position[from]], tmpBlock) != from)
					;
				while(moveTop(tmpBlock, blocks[position[to]]) >= 0)
					;
			}
		}
		for (int i = 0; i < n; ++i) {
			blocks[i].print();
		}
	}
}


