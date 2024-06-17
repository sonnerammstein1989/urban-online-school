import java.util.HashSet;
public class lessHashSet {

    class ColorSet extends HashSet<ColorSet.Color> {//implements Comparable<ColorSet>{
        public ColorSet compare(ColorSet o) {
            HashSet<Color> ret = new HashSet<>();
            for(Color a : this) for(Color b : o)
                if(a.equals(b))ret.add(a);
            return new ColorSet(ret);
        }
        public ColorSet(HashSet<Color> arr){
            super(arr.stream().toList());
        }
        public ColorSet(String[] arr){
            super();
            for(String s: arr) this.add(new Color(s));
        }

        class Color implements Comparable<Color>{
            String color;
            public Color(String s){ color = s; }

            @Override
            public int compareTo(Color clr){ return this.color.compareTo(clr.color); }

            public boolean equals(Color obj) { return this.color.equals(obj.color); }

            @Override
            public String toString(){ return color; }
        }
    }
    public void lesson(String[] args){
        ColorSet a = new ColorSet(new String[]{"red", "purple", "white", "blue" });
        ColorSet b = new ColorSet(new String[]{"red", "purple", "white", "green"});
        System.out.println(a.compare(b));
    }
}
