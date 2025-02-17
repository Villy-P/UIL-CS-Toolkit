<script lang="ts">
    import { topics } from '../../data/topics';
</script>

<div class="flex flex-col gap-4 pt-10 w-11/12 m-auto pb-2">
    <h1 class="text-6xl font-extrabold">Topics</h1>
    <p class="text-md">This page contains a list of all current topics covered on the UIL test. Each one contains a cheatsheet, and may contain a guide over the topic or questions relating to the topic to improve your skills.</p>
</div>
<div class="w-full flex justify-center pt-10 gap-5">
    {#each Object.keys(topics) as topic}
        <a class="shadow shadow-black px-2 py-1 cursor-pointer rounded-lg bg-[#161616] hover:bg-[#1c1c1c] !text-white" href="topics/{topic}/cheatsheet">
            {topic}
        </a>
    {/each}
</div>