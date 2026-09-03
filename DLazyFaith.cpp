#include <bits/stdc++.h>
using namespace std;

using L = long long;

int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int A, B, Q;
    if (!(cin >> A >> B >> Q)) return 0;

    
    vector<L> s = {-1000000000000LL}, t = {-1000000000000LL};
    L v;

    while (A--) {
        cin >> v;
        s.push_back(v);
    }
    s.push_back(1000000000000LL);

    while (B--) {
        cin >> v;
        t.push_back(v);
    }
    t.push_back(1000000000000LL);

    while (Q--) {
        cin >> v;
        auto i = lower_bound(begin(s), end(s), v);
        auto j = lower_bound(begin(t), end(t), v);
        
        L ans = 1000000000000000000LL; 
        
        for (L a : {*i, *(i - 1)}) {
            for (L b : {*j, *(j - 1)}) {
                ans = min(ans, min(abs(v - a), abs(v - b)) + abs(a - b));
            }
        }
        cout << ans << "\n";
    }
    return 0;
}
