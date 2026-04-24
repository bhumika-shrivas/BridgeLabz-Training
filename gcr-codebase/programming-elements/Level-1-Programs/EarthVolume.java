
public class EarthVolume {
    public static void main(String[] args) {

        double pi = 3.14;
        int r = 6378;
        double earthVolumeInKm = (4.0 / 3.0) * pi * r * r * r;
        double earthVolumeInMiles = earthVolumeInKm * 1.6;

        System.out.println(
            "The volume of earth in cubic kilometers is " + earthVolumeInKm +
            " and cubic miles is " + earthVolumeInMiles
        );
    }
}
