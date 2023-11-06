package lotto.model;

import java.util.List;

public class BonusNumber {
    private final int bonusNumber;

    public BonusNumber(int bonusNumber, List<Integer> winningNumbers) {
        validateRange(bonusNumber);
        validateDuplication(bonusNumber, winningNumbers);
        this.bonusNumber = bonusNumber;
    }

    private void validateRange(int bonusNumber) {
        if (bonusNumber < 1 || 45 < bonusNumber) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication(int bonusNumber, List<Integer> winningNumbers) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException();
        }
    }

    public int bonusNumber() {
        return this.bonusNumber;
    }
}
