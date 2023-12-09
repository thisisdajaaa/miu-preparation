package test;

public class User {
    public int rank;
    public int progress;

    private static final int MAX_RANK = 8;
    private static final int MIN_RANK = -8;
    private static final int MAX_PROGRESS = 100;

    public User() {
        this.rank = -8;
        this.progress = 0;
    }

    public int getRank() {
        return this.rank;
    }

    public int getProgress() {
        return this.progress;
    }

    private int calculateRankDifference(int activityRank) {
        // Adjust the activity rank and user rank to account for the missing 0 rank.
        int adjustedActivityRank = activityRank > 0 ? activityRank - 1 : activityRank;
        int adjustedUserRank = this.rank > 0 ? this.rank - 1 : this.rank;

        return adjustedActivityRank - adjustedUserRank;
    }

    public void incProgress(int activityRank) {
        if (activityRank < MIN_RANK || activityRank > MAX_RANK || activityRank == 0) {
            throw new IllegalArgumentException("Invalid rank");
        }
        if (this.rank == MAX_RANK) {
            // If the user's rank is already at the max, don't increase progress.
            return;
        }

        int difference = calculateRankDifference(activityRank);

        if (difference > 0) {
            // Completing an activity that is ranked higher than the user's rank
            this.progress += 10 * difference * difference;
        } else if (difference == 0) {
            // Completing an activity that is ranked the same as the user's rank
            this.progress += 3;
        } else if (difference == -1) {
            // Completing an activity that is ranked one ranking lower than the user's rank
            this.progress += 1;
        }
        // No progress is added for activities that are ranked two levels or more lower than the user's rank.

        // Increase rank and carry over the progress if needed
        while (this.progress >= 100) {
            this.progress -= 100;
            if (this.rank == -1) {
                this.rank = 1;
            } else {
                this.rank++;
            }

            // If max rank is achieved, cap progress to 0.
            if (this.rank >= MAX_RANK) {
                this.rank = MAX_RANK;
                this.progress = 0;
                break;
            }
        }
    }

}
