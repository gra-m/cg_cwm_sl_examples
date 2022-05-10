package cg.threads._17._08;

// region ORIGINAL
/*
Without using synchronized, make the number of proposals made equal to the number of and proposals accepted.
Requirements:

    •
    The Solution class must have a MakeProposal thread.
    •
    The Solution class must have an AcceptProposal thread.
    •
    The Solution class must have a public static int proposal.
    •
    The program should not have synchronized methods or synchronized blocks.
    •
    The int variable proposal should not be stored in the local cache.
   /////////////////////////////////////////////////////////

public class Solution {
    public static int proposal = 0;

    public static void main(String[] args) {
        new AcceptProposal().start();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Made Proposal No. " + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Accepted Proposal No." + proposal);
                    thisProposal = proposal;
                }
            }
        }
    }
}



 */
// endregion


public class Solution {
public volatile static int proposal = 0;

public static void main(String[] args) {
	new AcceptProposal().start();
	new MakeProposal().start();
}

public static class MakeProposal extends Thread {
	@Override
	public void run() {
		int thisProposal = proposal;

		while (proposal < 10) {
			System.out.println("Made Proposal No. " + (thisProposal + 1));
			proposal = ++thisProposal;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public static class AcceptProposal extends Thread {
	@Override
	public void run() {
		int thisProposal = proposal;

		while (thisProposal < 10) {
			if (thisProposal != proposal) {
				System.out.println("Accepted Proposal No." + proposal);
				thisProposal = proposal;
			}
		}
	}
}
}
