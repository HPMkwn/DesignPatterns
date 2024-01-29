package DesignPatternExercise.Exercise6Adapter;

public class ComputerGameAdapter implements PCGame{

    private ComputerGame computerGame;

    public ComputerGameAdapter(ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return this.computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        return this.computerGame.getPegiAgeRating().age;
    }

    @Override
    public boolean isTripleAGame() {
        return this.computerGame.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(this.computerGame.getMinimumGpuMemoryInMegabytes()/1000,
                this.computerGame.getDiskSpaceNeededInGB(),
                this.computerGame.getRamNeededInGb(),
                this.computerGame.getCoreSpeedInGhz(),
                this.computerGame.getCoresNeeded());
    }
}
