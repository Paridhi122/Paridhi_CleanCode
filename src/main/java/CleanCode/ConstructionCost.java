package CleanCode;

public class ConstructionCost {
    private int stdCost = 1200, abvStdCost = 1500, highStdCost = 1800, highStdAutoCost = 2500;
    public int standardHouseCost(int area){
        return area * stdCost;
    }
    public int aboveStandardHouseCost(int area){
        return area * abvStdCost;
    }
    public int highStandardHouseCost(int area, boolean auto){
        if(auto)
            return area * highStdAutoCost;
        else
            return area * highStdCost;
    }


}
