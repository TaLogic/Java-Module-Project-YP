public class Race {
    int time = 24;
    int maxDistance;
    Car winner;

    int[] distances = new int[3];


    Car getWinner(Car[] cars) {
        for(int i = 0; i < distances.length; i++) {
            distances[i] = time * cars[i].speed;
            if (distances[i] > maxDistance) {
                maxDistance = distances[i];
                winner = cars[i];
            }
        }
        return winner;
    }

}
